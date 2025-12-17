package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Taxi_alert: ImageVector
    get() {
        if (_Taxi_alert != null) return _Taxi_alert!!
        
        _Taxi_alert = ImageVector.Builder(
            name = "taxi_alert",
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
                moveTo(23f, 8f)
                arcTo(7f, 7f, 0f, false, false, 9.68f, 5f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.42f, 1.01f)
                lineTo(1f, 14f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-7.68f)
                arcTo(7.01f, 7.01f, 0f, false, false, 23f, 8f)
                close()
                moveToRelative(-18.5f, 0.5f)
                horizontalLineToRelative(4.53f)
                arcToRelative(6.93f, 6.93f, 0f, false, false, 2.08f, 4.5f)
                horizontalLineTo(3f)
                lineToRelative(1.5f, -4.5f)
                close()
                moveToRelative(0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                close()
                moveToRelative(11f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                close()
                moveToRelative(2.93f, -5.63f)
                lineToRelative(-0.21f, 0.11f)
                lineToRelative(-0.18f, 0.09f)
                arcToRelative(4.97f, 4.97f, 0f, false, true, -0.42f, 0.16f)
                lineToRelative(-0.22f, 0.07f)
                lineToRelative(-0.23f, 0.06f)
                lineToRelative(-0.2f, 0.05f)
                arcToRelative(5f, 5f, 0f, false, true, -5.94f, -4.41f)
                arcTo(4.07f, 4.07f, 0f, false, true, 11f, 8f)
                lineToRelative(0.02f, -0.47f)
                lineToRelative(0.02f, -0.17f)
                lineToRelative(0.04f, -0.28f)
                lineToRelative(0.04f, -0.21f)
                lineToRelative(0.05f, -0.21f)
                lineToRelative(0.07f, -0.24f)
                lineToRelative(0.05f, -0.13f)
                arcToRelative(4.99f, 4.99f, 0f, false, true, 9.69f, 1.7f)
                arcToRelative(4.96f, 4.96f, 0f, false, true, -2.55f, 4.38f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Taxi_alert!!
    }

private var _Taxi_alert: ImageVector? = null

