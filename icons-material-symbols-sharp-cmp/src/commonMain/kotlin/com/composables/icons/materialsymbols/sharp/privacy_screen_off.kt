package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Privacy_screen_off: ImageVector
    get() {
        if (_Privacy_screen_off != null) return _Privacy_screen_off!!
        
        _Privacy_screen_off = ImageVector.Builder(
            name = "privacy_screen_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 1028f)
                lineTo(686f, 896f)
                horizontalLineTo(80f)
                verticalLineTo(299f)
                horizontalLineToRelative(9f)
                lineToRelative(-63f, -63f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(160f, 760f)
                lineToRelative(195f, -195f)
                lineToRelative(-83f, -84f)
                lineToRelative(-112f, 112f)
                verticalLineToRelative(167f)
                close()
                moveToRelative(0f, -280f)
                lineToRelative(55f, 55f)
                lineToRelative(-55f, -55f)
                close()
                moveToRelative(56f, 336f)
                horizontalLineToRelative(390f)
                lineTo(411f, 621f)
                lineTo(216f, 816f)
                close()
                moveToRelative(664f, 47f)
                lineToRelative(-80f, -81f)
                verticalLineTo(336f)
                horizontalLineTo(696f)
                lineTo(525f, 507f)
                lineToRelative(-56f, -56f)
                lineToRelative(114f, -115f)
                horizontalLineTo(416f)
                lineToRelative(-30f, 32f)
                lineToRelative(-112f, -112f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(607f)
                close()
                moveTo(383f, 593f)
                close()
                moveToRelative(194f, -34f)
                close()
            }
        }.build()
        
        return _Privacy_screen_off!!
    }

private var _Privacy_screen_off: ImageVector? = null

