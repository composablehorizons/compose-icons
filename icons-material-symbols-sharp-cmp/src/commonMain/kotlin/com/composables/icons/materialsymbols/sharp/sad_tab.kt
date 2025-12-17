package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sad_tab: ImageVector
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
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
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

