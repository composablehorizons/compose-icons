package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Chalet: ImageVector
    get() {
        if (_Chalet != null) return _Chalet!!
        
        _Chalet = ImageVector.Builder(
            name = "chalet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.67f)
                lineToRelative(-0.38f, 0.38f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(6.09f, -6.09f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(6.09f, 6.09f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                verticalLineToRelative(0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(15f, 15.33f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveTo(11f, 15.45f, 10.55f, 15f, 10f, 15f)
                close()
                moveTo(17.5f, 7.5f)
                verticalLineToRelative(0.89f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-0.18f, 0.18f, -0.21f, 0.48f, -0.05f, 0.69f)
                curveToRelative(0.19f, 0.23f, 0.53f, 0.24f, 0.74f, 0.04f)
                lineToRelative(0.39f, -0.39f)
                verticalLineToRelative(0.69f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(9.81f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.21f, 0.21f, 0.55f, 0.19f, 0.74f, -0.04f)
                curveToRelative(0.17f, -0.2f, 0.14f, -0.5f, -0.05f, -0.69f)
                lineTo(18.5f, 8.39f)
                curveToRelative(0f, 0f, 0f, -0.89f, 0f, -0.89f)
                horizontalLineToRelative(0.89f)
                lineToRelative(1.08f, 1.08f)
                curveToRelative(0.18f, 0.18f, 0.48f, 0.21f, 0.69f, 0.05f)
                curveToRelative(0.23f, -0.19f, 0.24f, -0.53f, 0.04f, -0.74f)
                lineTo(20.81f, 7.5f)
                horizontalLineToRelative(0.69f)
                curveTo(21.78f, 7.5f, 22f, 7.28f, 22f, 7f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineToRelative(-0.69f, 0f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(0.21f, -0.21f, 0.19f, -0.55f, -0.04f, -0.74f)
                curveToRelative(-0.2f, -0.17f, -0.5f, -0.14f, -0.69f, 0.05f)
                lineTo(19.39f, 6.5f)
                curveToRelative(0f, 0f, -0.89f, 0f, -0.89f, 0f)
                verticalLineTo(5.61f)
                lineToRelative(1.08f, -1.08f)
                curveToRelative(0.18f, -0.18f, 0.21f, -0.48f, 0.05f, -0.69f)
                curveToRelative(-0.19f, -0.23f, -0.53f, -0.24f, -0.74f, -0.04f)
                lineTo(18.5f, 4.19f)
                verticalLineTo(3.5f)
                curveTo(18.5f, 3.22f, 18.28f, 3f, 18f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.69f)
                lineTo(17.11f, 3.8f)
                curveToRelative(-0.21f, -0.21f, -0.55f, -0.19f, -0.74f, 0.04f)
                curveToRelative(-0.17f, 0.2f, -0.14f, 0.5f, 0.05f, 0.69f)
                lineToRelative(1.08f, 1.08f)
                curveToRelative(0f, 0f, 0f, 0.89f, 0f, 0.89f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.08f, -1.08f)
                curveToRelative(-0.18f, -0.18f, -0.48f, -0.21f, -0.69f, -0.05f)
                curveToRelative(-0.23f, 0.19f, -0.24f, 0.53f, -0.04f, 0.74f)
                lineToRelative(0.39f, 0.39f)
                horizontalLineTo(14.5f)
                curveTo(14.22f, 6.5f, 14f, 6.72f, 14f, 7f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineToRelative(0.69f, 0f)
                lineTo(14.8f, 7.89f)
                curveToRelative(-0.21f, 0.21f, -0.19f, 0.55f, 0.04f, 0.74f)
                curveToRelative(0.2f, 0.17f, 0.5f, 0.14f, 0.69f, -0.05f)
                lineToRelative(1.08f, -1.08f)
                curveTo(16.61f, 7.5f, 17.5f, 7.5f, 17.5f, 7.5f)
                close()
            }
        }.build()
        
        return _Chalet!!
    }

private var _Chalet: ImageVector? = null

