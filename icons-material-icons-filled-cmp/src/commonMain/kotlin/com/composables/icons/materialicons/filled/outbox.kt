package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Outbox: ImageVector
    get() {
        if (_Outbox != null) return _Outbox!!
        
        _Outbox = ImageVector.Builder(
            name = "outbox",
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
                moveTo(19f, 3f)
                horizontalLineTo(4.99f)
                curveToRelative(-1.11f, 0f, -1.98f, 0.9f, -1.98f, 2f)
                lineTo(3f, 19f)
                curveToRelative(0f, 1.1f, 0.88f, 2f, 1.99f, 2f)
                horizontalLineTo(19f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, 1.66f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                horizontalLineTo(4.99f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineToRelative(10f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                close()
            }
        }.build()
        
        return _Outbox!!
    }

private var _Outbox: ImageVector? = null

