package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CheckSquare: ImageVector
    get() {
        if (_CheckSquare != null) return _CheckSquare!!
        
        _CheckSquare = ImageVector.Builder(
            name = "check-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 400f)
                horizontalLineTo(48f)
                verticalLineTo(80f)
                horizontalLineToRelative(352f)
                verticalLineToRelative(352f)
                close()
                moveToRelative(-35.864f, -241.724f)
                lineTo(191.547f, 361.48f)
                curveToRelative(-4.705f, 4.667f, -12.303f, 4.637f, -16.97f, -0.068f)
                lineToRelative(-90.781f, -91.516f)
                curveToRelative(-4.667f, -4.705f, -4.637f, -12.303f, 0.069f, -16.971f)
                lineToRelative(22.719f, -22.536f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.069f)
                lineToRelative(59.792f, 60.277f)
                lineToRelative(141.352f, -140.216f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.068f)
                lineToRelative(22.536f, 22.718f)
                curveToRelative(4.667f, 4.706f, 4.637f, 12.304f, -0.068f, 16.971f)
                close()
            }
        }.build()
        
        return _CheckSquare!!
    }

private var _CheckSquare: ImageVector? = null

