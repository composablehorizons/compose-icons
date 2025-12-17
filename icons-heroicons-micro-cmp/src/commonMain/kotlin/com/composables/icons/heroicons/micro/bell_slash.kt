package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 7.379f)
                verticalLineToRelative(-0.904f)
                lineToRelative(6.743f, 6.742f)
                arcTo(3f, 3f, 0f, false, true, 5f, 12f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineTo(3.56f, 8.44f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 7.38f)
                close()
                moveTo(6.5f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 11f)
                arcToRelative(0.997f, 0.997f, 0f, false, true, -0.096f, 0.429f)
                lineTo(4.92f, 2.446f)
                arcTo(4f, 4f, 0f, false, true, 12f, 5f)
                verticalLineToRelative(2.379f)
                curveToRelative(0f, 0.398f, 0.158f, 0.779f, 0.44f, 1.06f)
                lineToRelative(1.267f, 1.268f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineTo(11f)
                close()
                moveTo(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

