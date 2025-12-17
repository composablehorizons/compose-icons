package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Eyedropper: ImageVector
    get() {
        if (_Eyedropper != null) return _Eyedropper!!
        
        _Eyedropper = ImageVector.Builder(
            name = "eyedropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.354f, 0.646f)
                arcToRelative(1.207f, 1.207f, 0f, false, false, -1.708f, 0f)
                lineTo(8.5f, 3.793f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(8.293f, 5f)
                lineToRelative(-7.147f, 7.146f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1f, 12.5f)
                verticalLineToRelative(1.793f)
                lineToRelative(-0.854f, 0.853f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.707f)
                lineTo(1.707f, 15f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.354f, -0.146f)
                lineTo(11f, 7.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(3.147f, -3.146f)
                arcToRelative(1.207f, 1.207f, 0f, false, false, 0f, -1.708f)
                close()
                moveTo(2f, 12.707f)
                lineToRelative(7f, -7f)
                lineTo(10.293f, 7f)
                lineToRelative(-7f, 7f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Eyedropper!!
    }

private var _Eyedropper: ImageVector? = null

