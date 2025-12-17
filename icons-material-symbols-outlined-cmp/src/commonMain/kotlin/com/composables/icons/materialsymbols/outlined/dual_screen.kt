package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Dual_screen: ImageVector
    get() {
        if (_Dual_screen != null) return _Dual_screen!!
        
        _Dual_screen = ImageVector.Builder(
            name = "dual_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 704f)
                lineToRelative(240f, 96f)
                verticalLineToRelative(-544f)
                lineToRelative(-240f, -96f)
                verticalLineToRelative(544f)
                close()
                moveToRelative(-30f, 74f)
                quadToRelative(-23f, -9f, -36.5f, -29f)
                reflectiveQuadTo(160f, 704f)
                verticalLineToRelative(-544f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                lineToRelative(268f, 101f)
                quadToRelative(23f, 9f, 37.5f, 29.5f)
                reflectiveQuadTo(560f, 256f)
                verticalLineToRelative(544f)
                quadToRelative(0f, 43f, -35f, 66.5f)
                reflectiveQuadTo(450f, 874f)
                lineToRelative(-240f, -96f)
                close()
                moveToRelative(270f, -18f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-520f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(480f)
                close()
                moveToRelative(-240f, -56f)
                verticalLineToRelative(-544f)
                verticalLineToRelative(544f)
                close()
            }
        }.build()
        
        return _Dual_screen!!
    }

private var _Dual_screen: ImageVector? = null

