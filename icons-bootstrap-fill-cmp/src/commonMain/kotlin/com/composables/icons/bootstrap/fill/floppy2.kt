package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Floppy2: ImageVector
    get() {
        if (_Floppy2 != null) return _Floppy2!!
        
        _Floppy2 = ImageVector.Builder(
            name = "floppy2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 1.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 16f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(2.914f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(14.147f, 0.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.086f, 0f)
                close()
                moveTo(4f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Floppy2!!
    }

private var _Floppy2: ImageVector? = null

