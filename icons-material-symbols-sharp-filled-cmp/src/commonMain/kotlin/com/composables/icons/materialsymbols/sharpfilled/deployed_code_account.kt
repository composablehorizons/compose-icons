package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Deployed_code_account: ImageVector
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
                moveTo(680f, 850f)
                lineTo(500f, 745f)
                verticalLineToRelative(-209f)
                lineToRelative(180f, -105f)
                lineToRelative(180f, 105f)
                verticalLineToRelative(208f)
                lineTo(680f, 850f)
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

