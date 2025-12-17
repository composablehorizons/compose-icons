package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Atm: ImageVector
    get() {
        if (_Atm != null) return _Atm!!
        
        _Atm = ImageVector.Builder(
            name = "atm",
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
                moveTo(8f, 9.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(13.66f, 9f, 13.25f, 9f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                close()
                moveTo(6f, 9f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-0.5f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
                moveTo(21f, 9f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.76f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.76f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Atm!!
    }

private var _Atm: ImageVector? = null

