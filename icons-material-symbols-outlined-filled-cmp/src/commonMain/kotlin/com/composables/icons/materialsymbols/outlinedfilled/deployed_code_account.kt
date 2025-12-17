package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Deployed_code_account: ImageVector
    get() {
        if (_Deployed_code_account != null) return _Deployed_code_account!!
        
        _Deployed_code_account = ImageVector.Builder(
            name = "deployed_code_account",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 841f)
                quadToRelative(-8f, 0f, -16f, -2f)
                reflectiveQuadToRelative(-15f, -7f)
                lineToRelative(-120f, -70f)
                quadToRelative(-14f, -8f, -21.5f, -21.5f)
                reflectiveQuadTo(500f, 711f)
                verticalLineToRelative(-141f)
                quadToRelative(0f, -16f, 7.5f, -29.5f)
                reflectiveQuadTo(529f, 519f)
                lineToRelative(120f, -70f)
                quadToRelative(7f, -5f, 15f, -7f)
                reflectiveQuadToRelative(16f, -2f)
                quadToRelative(8f, 0f, 15.5f, 2.5f)
                reflectiveQuadTo(710f, 449f)
                lineToRelative(120f, 70f)
                quadToRelative(14f, 8f, 22f, 21.5f)
                reflectiveQuadToRelative(8f, 29.5f)
                verticalLineToRelative(141f)
                quadToRelative(0f, 16f, -8f, 29.5f)
                reflectiveQuadTo(830f, 762f)
                lineToRelative(-120f, 70f)
                quadToRelative(-7f, 4f, -14.5f, 6.5f)
                reflectiveQuadTo(680f, 841f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                horizontalLineToRelative(14f)
                quadToRelative(6f, 0f, 12f, 2f)
                quadToRelative(-29f, 72f, -24f, 143f)
                reflectiveQuadToRelative(48f, 135f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(186f, 74f)
                lineToRelative(94f, 55f)
                lineToRelative(94f, -55f)
                lineToRelative(-94f, -54f)
                lineToRelative(-94f, 54f)
                close()
                moveToRelative(124f, 208f)
                lineToRelative(90f, -52f)
                verticalLineToRelative(-110f)
                lineToRelative(-90f, 53f)
                verticalLineToRelative(109f)
                close()
                moveToRelative(-150f, -52f)
                lineToRelative(90f, 53f)
                verticalLineToRelative(-109f)
                lineToRelative(-90f, -53f)
                verticalLineToRelative(109f)
                close()
            }
        }.build()
        
        return _Deployed_code_account!!
    }

private var _Deployed_code_account: ImageVector? = null

