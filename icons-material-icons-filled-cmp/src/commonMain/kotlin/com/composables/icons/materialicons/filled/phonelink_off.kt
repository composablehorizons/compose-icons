package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phonelink_off: ImageVector
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(6.82f)
                lineToRelative(2f, 2f)
                horizontalLineTo(22f)
                close()
                moveTo(1.92f, 1.65f)
                lineTo(0.65f, 2.92f)
                lineToRelative(1.82f, 1.82f)
                curveTo(2.18f, 5.08f, 2f, 5.52f, 2f, 6f)
                verticalLineToRelative(11f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.89f, 3.62f)
                lineTo(1.92f, 1.65f)
                close()
                moveTo(4f, 6.27f)
                lineTo(14.73f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(6.27f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.18f)
                lineToRelative(2f, 2f)
                verticalLineTo(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(3f, 3f)
                horizontalLineTo(23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Phonelink_off!!
    }

private var _Phonelink_off: ImageVector? = null

