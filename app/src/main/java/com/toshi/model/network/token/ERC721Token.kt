/*
 * Copyright (c) 2017. Toshi Inc
 *
 *  This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.toshi.model.network.token

import com.squareup.moshi.Json
import com.toshi.model.local.token.ERC721TokenView

data class ERC721Token(
        @Json(name = "contract_address")
        val contractAddress: String?,
        @Json(name = "token_id")
        val tokenId: String?,
        @Json(name = "owner_address")
        val ownerAddress: String?,
        val name: String?,
        val image: String?,
        val description: String?,
        val misc: String?
) {
    fun mapToViewModel(): ERC721TokenView {
        return ERC721TokenView(
                contractAddress = this.contractAddress,
                tokenId = this.tokenId,
                ownerAddress = this.ownerAddress,
                name = this.name,
                image = this.image,
                description = this.description,
                misc = this.misc
        )
    }
}