package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sad_tab: ImageVector
    get() {
        if (_Sad_tab != null) return _Sad_tab!!
        
        _Sad_tab = ImageVector.Builder(
            name = "sad_tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 756f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineTo(360f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(20f, -180f)
                horizontalLineToRelative(60f)
                verticalLineTo(476f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(260f, 0f)
                horizontalLineToRelative(60f)
                verticalLineTo(476f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(100f)
                close()
                moveTo(160f, 896f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 416f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 896f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineTo(416f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(416f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Sad_tab!!
    }

private var _Sad_tab: ImageVector? = null

