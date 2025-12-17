package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cancel: ImageVector
    get() {
        if (_Cancel != null) return _Cancel!!
        
        _Cancel = ImageVector.Builder(
            name = "cancel",
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
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.47f, 10f, -10f)
                reflectiveCurveTo(17.53f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveToRelative(3.59f, -13f)
                lineTo(12f, 10.59f)
                lineTo(8.41f, 7f)
                lineTo(7f, 8.41f)
                lineTo(10.59f, 12f)
                lineTo(7f, 15.59f)
                lineTo(8.41f, 17f)
                lineTo(12f, 13.41f)
                lineTo(15.59f, 17f)
                lineTo(17f, 15.59f)
                lineTo(13.41f, 12f)
                lineTo(17f, 8.41f)
                close()
            }
        }.build()
        
        return _Cancel!!
    }

private var _Cancel: ImageVector? = null

