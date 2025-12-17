package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fiber_manual_record: ImageVector
    get() {
        if (_Fiber_manual_record != null) return _Fiber_manual_record!!
        
        _Fiber_manual_record = ImageVector.Builder(
            name = "fiber_manual_record",
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
                moveTo(12f, 18f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 20f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                reflectiveCurveToRelative(-3.58f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                close()
                moveToRelative(0f, -14f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                close()
            }
        }.build()
        
        return _Fiber_manual_record!!
    }

private var _Fiber_manual_record: ImageVector? = null

