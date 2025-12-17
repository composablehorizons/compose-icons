package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Phonelink_off: ImageVector
    get() {
        if (_Phonelink_off != null) return _Phonelink_off!!
        
        _Phonelink_off = ImageVector.Builder(
            name = "phonelink_off",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 17f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4.61f)
                lineTo(20.39f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 8f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.61f)
                lineToRelative(2f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(2.93f, 2.93f)
                curveToRelative(0.39f, -0.13f, 0.68f, -0.49f, 0.68f, -0.93f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(-1f, -2f)
                verticalLineTo(4f)
                horizontalLineTo(7.39f)
                lineToRelative(2f, 2f)
                close()
                moveTo(0.65f, 2.92f)
                lineToRelative(1.82f, 1.82f)
                curveTo(2.18f, 5.08f, 2f, 5.52f, 2f, 6f)
                verticalLineToRelative(11f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.06f, 1.51f)
                lineTo(0.65f, 2.92f)
                close()
                moveTo(4f, 6.27f)
                lineTo(14.73f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(6.27f)
                close()
            }
        }.build()
        
        return _Phonelink_off!!
    }

private var _Phonelink_off: ImageVector? = null

