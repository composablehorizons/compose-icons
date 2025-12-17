package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaptopHouse: ImageVector
    get() {
        if (_LaptopHouse != null) return _LaptopHouse!!
        
        _LaptopHouse = ImageVector.Builder(
            name = "laptop-house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 288f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(37.12f)
                curveTo(299.11f, 232.24f, 315f, 224f, 332.8f, 224f)
                horizontalLineTo(469.74f)
                lineToRelative(6.65f, -7.53f)
                arcTo(16.51f, 16.51f, 0f, false, false, 480f, 207f)
                arcToRelative(16.31f, 16.31f, 0f, false, false, -4.75f, -10.61f)
                lineTo(416f, 144f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineTo(87.3f)
                lineTo(263.5f, 8.92f)
                curveTo(258f, 4f, 247.45f, 0f, 240.05f, 0f)
                reflectiveCurveToRelative(-17.93f, 4f, -23.47f, 8.92f)
                lineTo(4.78f, 196.42f)
                arcTo(16.15f, 16.15f, 0f, false, false, 0f, 207f)
                arcToRelative(16.4f, 16.4f, 0f, false, false, 3.55f, 9.39f)
                lineTo(22.34f, 237.7f)
                arcTo(16.22f, 16.22f, 0f, false, false, 33f, 242.48f)
                arcTo(16.51f, 16.51f, 0f, false, false, 42.34f, 239f)
                lineTo(64f, 219.88f)
                verticalLineTo(384f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(272f)
                close()
                moveTo(629.33f, 448f)
                horizontalLineTo(592f)
                verticalLineTo(288f)
                curveToRelative(0f, -17.67f, -12.89f, -32f, -28.8f, -32f)
                horizontalLineTo(332.8f)
                curveToRelative(-15.91f, 0f, -28.8f, 14.33f, -28.8f, 32f)
                verticalLineTo(448f)
                horizontalLineTo(266.67f)
                arcTo(10.67f, 10.67f, 0f, false, false, 256f, 458.67f)
                verticalLineToRelative(10.66f)
                arcTo(42.82f, 42.82f, 0f, false, false, 298.6f, 512f)
                horizontalLineTo(597.4f)
                arcTo(42.82f, 42.82f, 0f, false, false, 640f, 469.33f)
                verticalLineTo(458.67f)
                arcTo(10.67f, 10.67f, 0f, false, false, 629.33f, 448f)
                close()
                moveTo(544f, 448f)
                horizontalLineTo(352f)
                verticalLineTo(304f)
                horizontalLineTo(544f)
                close()
            }
        }.build()
        
        return _LaptopHouse!!
    }

private var _LaptopHouse: ImageVector? = null

