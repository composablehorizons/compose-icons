package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cases: ImageVector
    get() {
        if (_Cases != null) return _Cases!!
        
        _Cases = ImageVector.Builder(
            name = "cases",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 6f)
                verticalLineTo(4f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-5f)
                lineTo(9f, 4f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(11f)
                reflectiveCurveToRelative(1f, 2f, 2f, 2f)
                horizontalLineToRelative(13f)
                reflectiveCurveToRelative(2f, -0.98f, 2f, -2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                close()
                moveToRelative(7f, -4f)
                curveToRelative(0f, -0.55f, 0.53f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.46f, 0f, 1f, 0.54f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Cases!!
    }

private var _Cases: ImageVector? = null

