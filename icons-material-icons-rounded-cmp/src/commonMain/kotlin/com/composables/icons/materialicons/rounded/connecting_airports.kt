package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Connecting_airports: ImageVector
    get() {
        if (_Connecting_airports != null) return _Connecting_airports!!
        
        _Connecting_airports = ImageVector.Builder(
            name = "connecting_airports",
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
                moveTo(15.93f, 10.6f)
                curveToRelative(0.39f, 0f, 0.66f, 0.37f, 0.55f, 0.74f)
                lineTo(15.4f, 15f)
                horizontalLineToRelative(2.85f)
                lineToRelative(0.59f, -0.78f)
                curveToRelative(0.1f, -0.14f, 0.26f, -0.22f, 0.43f, -0.22f)
                curveToRelative(0.36f, 0f, 0.62f, 0.35f, 0.52f, 0.7f)
                lineTo(19.4f, 16f)
                lineToRelative(0.39f, 1.3f)
                curveToRelative(0.1f, 0.35f, -0.16f, 0.7f, -0.52f, 0.7f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.08f, -0.43f, -0.22f)
                lineTo(18.25f, 17f)
                horizontalLineTo(15.4f)
                lineToRelative(1.08f, 3.66f)
                curveToRelative(0.11f, 0.37f, -0.17f, 0.74f, -0.55f, 0.74f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.11f, -0.5f, -0.28f)
                lineTo(13f, 17f)
                horizontalLineToRelative(-2.97f)
                curveToRelative(-0.53f, 0f, -1f, -0.4f, -1.03f, -0.93f)
                curveTo(8.96f, 15.48f, 9.43f, 15f, 10f, 15f)
                horizontalLineToRelative(3f)
                lineToRelative(2.43f, -4.12f)
                curveTo(15.54f, 10.71f, 15.73f, 10.6f, 15.93f, 10.6f)
                close()
                moveTo(8.07f, 2.6f)
                curveToRelative(-0.39f, 0f, -0.66f, 0.37f, -0.55f, 0.74f)
                lineTo(8.6f, 7f)
                horizontalLineTo(5.75f)
                lineTo(5.16f, 6.22f)
                curveTo(5.06f, 6.08f, 4.9f, 6f, 4.73f, 6f)
                curveTo(4.37f, 6f, 4.11f, 6.35f, 4.21f, 6.7f)
                lineTo(4.6f, 8f)
                lineTo(4.21f, 9.3f)
                curveTo(4.11f, 9.65f, 4.37f, 10f, 4.73f, 10f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.43f, -0.22f)
                lineTo(5.75f, 9f)
                horizontalLineTo(8.6f)
                lineToRelative(-1.08f, 3.66f)
                curveToRelative(-0.11f, 0.37f, 0.17f, 0.74f, 0.55f, 0.74f)
                curveToRelative(0.2f, 0f, 0.39f, -0.11f, 0.5f, -0.28f)
                lineTo(11f, 9f)
                horizontalLineToRelative(2.97f)
                curveToRelative(0.53f, 0f, 1f, -0.4f, 1.03f, -0.93f)
                curveTo(15.04f, 7.48f, 14.57f, 7f, 14f, 7f)
                horizontalLineToRelative(-3f)
                lineTo(8.57f, 2.88f)
                curveTo(8.46f, 2.71f, 8.27f, 2.6f, 8.07f, 2.6f)
                close()
            }
        }.build()
        
        return _Connecting_airports!!
    }

private var _Connecting_airports: ImageVector? = null

