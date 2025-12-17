package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Steam: ImageVector
    get() {
        if (_Steam != null) return _Steam!!
        
        _Steam = ImageVector.Builder(
            name = "steam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.329f, 10.333f)
                arcTo(8.01f, 8.01f, 0f, false, false, 7.99f, 16f)
                curveTo(12.414f, 16f, 16f, 12.418f, 16f, 8f)
                reflectiveCurveToRelative(-3.586f, -8f, -8.009f, -8f)
                arcTo(8.006f, 8.006f, 0f, false, false, 0f, 7.468f)
                lineToRelative(0.003f, 0.006f)
                lineToRelative(4.304f, 1.769f)
                arcTo(2.2f, 2.2f, 0f, false, true, 5.62f, 8.88f)
                lineToRelative(1.96f, -2.844f)
                lineToRelative(-0.001f, -0.04f)
                arcToRelative(3.046f, 3.046f, 0f, false, true, 3.042f, -3.043f)
                arcToRelative(3.046f, 3.046f, 0f, false, true, 3.042f, 3.043f)
                arcToRelative(3.047f, 3.047f, 0f, false, true, -3.111f, 3.044f)
                lineToRelative(-2.804f, 2f)
                arcToRelative(2.223f, 2.223f, 0f, false, true, -3.075f, 2.11f)
                arcToRelative(2.22f, 2.22f, 0f, false, true, -1.312f, -1.568f)
                lineTo(0.33f, 10.333f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.868f, 12.683f)
                arcToRelative(1.715f, 1.715f, 0f, false, false, 1.318f, -3.165f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -1.263f, -0.02f)
                lineToRelative(1.023f, 0.424f)
                arcToRelative(1.261f, 1.261f, 0f, true, true, -0.97f, 2.33f)
                lineToRelative(-0.99f, -0.41f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, 0.882f, 0.84f)
                close()
                moveToRelative(3.726f, -6.687f)
                arcToRelative(2.03f, 2.03f, 0f, false, false, 2.027f, 2.029f)
                arcToRelative(2.03f, 2.03f, 0f, false, false, 2.027f, -2.029f)
                arcToRelative(2.03f, 2.03f, 0f, false, false, -2.027f, -2.027f)
                arcToRelative(2.03f, 2.03f, 0f, false, false, -2.027f, 2.027f)
                moveToRelative(2.03f, -1.527f)
                arcToRelative(1.524f, 1.524f, 0f, true, true, -0.002f, 3.048f)
                arcToRelative(1.524f, 1.524f, 0f, false, true, 0.002f, -3.048f)
            }
        }.build()
        
        return _Steam!!
    }

private var _Steam: ImageVector? = null

