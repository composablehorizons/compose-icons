package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cached: ImageVector
    get() {
        if (_Cached != null) return _Cached!!
        
        _Cached = ImageVector.Builder(
            name = "cached",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.65f, 8.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f)
                horizontalLineTo(18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-0.79f, 0f, -1.56f, -0.15f, -2.25f, -0.44f)
                curveToRelative(-0.36f, -0.15f, -0.77f, -0.04f, -1.04f, 0.23f)
                curveToRelative(-0.51f, 0.51f, -0.33f, 1.37f, 0.34f, 1.64f)
                curveToRelative(0.91f, 0.37f, 1.91f, 0.57f, 2.95f, 0.57f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(0.79f, 0f, 1.56f, 0.15f, 2.25f, 0.44f)
                curveToRelative(0.36f, 0.15f, 0.77f, 0.04f, 1.04f, -0.23f)
                curveToRelative(0.51f, -0.51f, 0.33f, -1.37f, -0.34f, -1.64f)
                curveTo(14.04f, 4.2f, 13.04f, 4f, 12f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                horizontalLineTo(2.21f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Cached!!
    }

private var _Cached: ImageVector? = null

