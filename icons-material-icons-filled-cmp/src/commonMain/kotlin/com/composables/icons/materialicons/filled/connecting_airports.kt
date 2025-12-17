package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Connecting_airports: ImageVector
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
                moveTo(15.4f, 17f)
                lineToRelative(1.3f, 4.4f)
                horizontalLineToRelative(-1.1f)
                lineTo(13f, 17f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                lineToRelative(2.6f, -4.4f)
                horizontalLineToRelative(1.1f)
                lineTo(15.4f, 15f)
                horizontalLineToRelative(2.85f)
                lineTo(19f, 14f)
                horizontalLineToRelative(1f)
                lineToRelative(-0.6f, 2f)
                lineToRelative(0.6f, 2f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.75f, -1f)
                horizontalLineTo(15.4f)
                close()
                moveTo(5.75f, 7f)
                lineTo(5f, 6f)
                horizontalLineTo(4f)
                lineToRelative(0.6f, 2f)
                lineTo(4f, 10f)
                horizontalLineToRelative(1f)
                lineToRelative(0.75f, -1f)
                horizontalLineTo(8.6f)
                lineToRelative(-1.3f, 4.4f)
                horizontalLineToRelative(1.1f)
                lineTo(11f, 9f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                lineTo(8.4f, 2.6f)
                horizontalLineTo(7.3f)
                lineTo(8.6f, 7f)
                horizontalLineTo(5.75f)
                close()
            }
        }.build()
        
        return _Connecting_airports!!
    }

private var _Connecting_airports: ImageVector? = null

