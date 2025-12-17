package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GenderAmbiguous: ImageVector
    get() {
        if (_GenderAmbiguous != null) return _GenderAmbiguous!!
        
        _GenderAmbiguous = ImageVector.Builder(
            name = "gender-ambiguous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(1.707f)
                lineToRelative(-3.45f, 3.45f)
                arcTo(4f, 4f, 0f, false, true, 8.5f, 10.97f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.03f)
                arcToRelative(4f, 4f, 0f, true, true, 3.471f, -6.648f)
                lineTo(14.293f, 1f)
                close()
                moveToRelative(-0.997f, 4.346f)
                arcToRelative(3f, 3f, 0f, true, false, -5.006f, 3.309f)
                arcToRelative(3f, 3f, 0f, false, false, 5.006f, -3.31f)
                close()
            }
        }.build()
        
        return _GenderAmbiguous!!
    }

private var _GenderAmbiguous: ImageVector? = null

