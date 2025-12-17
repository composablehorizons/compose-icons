package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Group_work: ImageVector
    get() {
        if (_Group_work != null) return _Group_work!!
        
        _Group_work = ImageVector.Builder(
            name = "group_work",
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
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 14f)
                arcTo(2f, 2f, 0f, false, true, 8f, 16f)
                arcTo(2f, 2f, 0f, false, true, 6f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, false, true, 12f, 10f)
                arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                arcTo(2f, 2f, 0f, false, true, 14f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 14f)
                arcTo(2f, 2f, 0f, false, true, 16f, 16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 14f)
                arcTo(2f, 2f, 0f, false, true, 18f, 14f)
                close()
            }
        }.build()
        
        return _Group_work!!
    }

private var _Group_work: ImageVector? = null

