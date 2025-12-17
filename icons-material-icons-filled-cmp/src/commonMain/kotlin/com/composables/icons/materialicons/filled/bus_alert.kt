package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bus_alert: ImageVector
    get() {
        if (_Bus_alert != null) return _Bus_alert!!
        
        _Bus_alert = ImageVector.Builder(
            name = "bus_alert",
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
                moveTo(16f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, -5.78f, 3.05f)
                lineToRelative(0.02f, -0.03f)
                curveTo(9.84f, 4f, 9.42f, 4f, 9f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineTo(22f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                verticalLineToRelative(-3.08f)
                arcTo(7f, 7f, 0f, false, false, 16f, 1f)
                close()
                moveTo(4.5f, 19f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                close()
                moveTo(3f, 13f)
                verticalLineTo(8f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.96f, 0.81f, 3.73f, 2.11f, 5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(10.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                close()
                moveToRelative(2.5f, -6f)
                arcToRelative(5f, 5f, 0f, true, true, 0f, -10f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 10f)
                close()
                moveToRelative(-1f, -9f)
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
        
        return _Bus_alert!!
    }

private var _Bus_alert: ImageVector? = null

