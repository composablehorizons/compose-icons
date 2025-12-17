package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Outlet: ImageVector
    get() {
        if (_Outlet != null) return _Outlet!!
        
        _Outlet = ImageVector.Builder(
            name = "outlet",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(8f, 12f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineTo(8f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-4f)
                lineToRelative(0f, -1.89f)
                curveToRelative(0f, -1f, 0.68f, -1.92f, 1.66f, -2.08f)
                curveTo(12.92f, 13.82f, 14f, 14.79f, 14f, 16f)
                verticalLineTo(18f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _Outlet!!
    }

private var _Outlet: ImageVector? = null

