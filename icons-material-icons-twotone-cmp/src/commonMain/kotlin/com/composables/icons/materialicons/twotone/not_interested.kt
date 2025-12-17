package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Not_interested: ImageVector
    get() {
        if (_Not_interested != null) return _Not_interested!!
        
        _Not_interested = ImageVector.Builder(
            name = "not_interested",
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
                moveTo(12f, 22f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                close()
                moveToRelative(0f, -18f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                curveToRelative(0f, 1.85f, -0.63f, 3.55f, -1.69f, 4.9f)
                lineTo(7.1f, 5.69f)
                curveTo(8.45f, 4.63f, 10.15f, 4f, 12f, 4f)
                close()
                moveTo(5.69f, 7.1f)
                lineTo(16.9f, 18.31f)
                curveTo(15.55f, 19.37f, 13.85f, 20f, 12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                close()
            }
        }.build()
        
        return _Not_interested!!
    }

private var _Not_interested: ImageVector? = null

