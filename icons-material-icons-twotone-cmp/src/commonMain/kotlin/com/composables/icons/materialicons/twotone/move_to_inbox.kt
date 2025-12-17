package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Move_to_inbox: ImageVector
    get() {
        if (_Move_to_inbox != null) return _Move_to_inbox!!
        
        _Move_to_inbox = ImageVector.Builder(
            name = "move_to_inbox",
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
                moveTo(12.01f, 18f)
                curveToRelative(-1.48f, 0f, -2.75f, -0.81f, -3.45f, -2f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(-0.69f, 1.19f, -1.97f, 2f, -3.44f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 9f)
                horizontalLineToRelative(-2.55f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(3f, -6f)
                horizontalLineTo(4.99f)
                curveTo(3.88f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.88f, 2f, 1.99f, 2f)
                horizontalLineTo(19f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.56f)
                curveToRelative(0.69f, 1.19f, 1.97f, 2f, 3.45f, 2f)
                reflectiveCurveToRelative(2.75f, -0.81f, 3.45f, -2f)
                horizontalLineTo(19f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineToRelative(-4.99f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineTo(5f)
                lineToRelative(-0.01f, -9f)
                horizontalLineTo(19f)
                verticalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Move_to_inbox!!
    }

private var _Move_to_inbox: ImageVector? = null

