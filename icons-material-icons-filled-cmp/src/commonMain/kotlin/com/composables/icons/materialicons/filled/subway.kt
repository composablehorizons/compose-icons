package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Subway: ImageVector
    get() {
        if (_Subway != null) return _Subway!!
        
        _Subway = ImageVector.Builder(
            name = "subway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
                moveToRelative(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(8.86f)
                curveTo(2f, 6.05f, 3.53f, 3.84f, 6.2f, 2.8f)
                curveTo(8f, 2.09f, 10.14f, 2f, 12f, 2f)
                curveToRelative(1.86f, 0f, 4f, 0.09f, 5.8f, 0.8f)
                curveTo(20.47f, 3.84f, 22f, 6.05f, 22f, 8.86f)
                verticalLineTo(22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 15.5f, 17f)
                arcTo(1f, 1f, 0f, false, true, 14.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 16.5f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 8.5f, 17f)
                arcTo(1f, 1f, 0f, false, true, 7.5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 9.5f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.01f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(17.8f, 2.8f)
                curveTo(16f, 2.09f, 13.86f, 2f, 12f, 2f)
                curveToRelative(-1.86f, 0f, -4f, 0.09f, -5.8f, 0.8f)
                curveTo(3.53f, 3.84f, 2f, 6.05f, 2f, 8.86f)
                verticalLineTo(22f)
                horizontalLineToRelative(20f)
                verticalLineTo(8.86f)
                curveToRelative(0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f)
                close()
                moveToRelative(0.2f, 13.08f)
                curveToRelative(0f, 1.45f, -1.18f, 2.62f, -2.63f, 2.62f)
                lineToRelative(1.13f, 1.12f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-2.83f)
                lineTo(9.17f, 20f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-0.38f)
                lineToRelative(1.12f, -1.12f)
                curveTo(7.18f, 18.5f, 6f, 17.32f, 6f, 15.88f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.63f, 3f, -3f, 6f, -3f)
                curveToRelative(3.32f, 0f, 6f, 0.38f, 6f, 3f)
                verticalLineToRelative(6.88f)
                close()
            }
        }.build()
        
        return _Subway!!
    }

private var _Subway: ImageVector? = null

