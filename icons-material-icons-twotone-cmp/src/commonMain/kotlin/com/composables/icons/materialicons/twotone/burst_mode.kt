package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Burst_mode: ImageVector
    get() {
        if (_Burst_mode != null) return _Burst_mode!!
        
        _Burst_mode = ImageVector.Builder(
            name = "burst_mode",
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
                moveTo(11f, 17f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(3f, -3.53f)
                lineToRelative(1.43f, 1.72f)
                lineToRelative(2f, -2.58f)
                lineTo(20f, 15.99f)
                horizontalLineToRelative(-8f)
                lineToRelative(2f, -2.52f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                close()
                moveToRelative(17f, 0f)
                horizontalLineTo(10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-1f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(-3.57f, -4.38f)
                lineToRelative(-2f, 2.57f)
                lineTo(14f, 13.47f)
                lineToRelative(-2f, 2.52f)
                horizontalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Burst_mode!!
    }

private var _Burst_mode: ImageVector? = null

