package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ac_unit: ImageVector
    get() {
        if (_Ac_unit != null) return _Ac_unit!!
        
        _Ac_unit = ImageVector.Builder(
            name = "ac_unit",
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
                moveTo(21f, 11f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(2.54f, -2.54f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                lineTo(15f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                lineToRelative(3.95f, -3.95f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(13f, 6.17f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.17f)
                lineTo(8.46f, 3.63f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                lineTo(11f, 9f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                lineTo(5.05f, 7.05f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(6.17f, 11f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-2.54f, 2.54f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                lineTo(9f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineToRelative(-3.95f, 3.95f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(11f, 17.83f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.17f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                lineTo(13f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(3.95f, 3.95f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(17.83f, 13f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Ac_unit!!
    }

private var _Ac_unit: ImageVector? = null

