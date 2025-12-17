package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hot_tub: ImageVector
    get() {
        if (_Hot_tub != null) return _Hot_tub!!
        
        _Hot_tub = ImageVector.Builder(
            name = "hot_tub",
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
                moveTo(9f, 6f)
                arcTo(2f, 2f, 0f, false, true, 7f, 8f)
                arcTo(2f, 2f, 0f, false, true, 5f, 6f)
                arcTo(2f, 2f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.15f, 12f)
                curveToRelative(-0.31f, -0.22f, -0.59f, -0.46f, -0.82f, -0.72f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(6.01f, 9f, 5f, 10.01f, 5f, 11.25f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(20f)
                verticalLineTo(12f)
                horizontalLineTo(11.15f)
                close()
                moveTo(7f, 20f)
                horizontalLineTo(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineTo(9f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(-0.35f, -14.14f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(18f, 3f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineToRelative(-0.11f, 0.59f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f)
                close()
                moveToRelative(-4f, 0f)
                lineToRelative(-0.07f, -0.07f)
                curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                lineTo(14f, 3f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(-0.06f, 0.43f)
                curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                lineToRelative(0.07f, 0.06f)
                curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                lineToRelative(-0.11f, 0.59f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.06f, -0.43f)
                curveToRelative(0.21f, -1.36f, -0.27f, -2.71f, -1.3f, -3.71f)
                close()
            }
        }.build()
        
        return _Hot_tub!!
    }

private var _Hot_tub: ImageVector? = null

