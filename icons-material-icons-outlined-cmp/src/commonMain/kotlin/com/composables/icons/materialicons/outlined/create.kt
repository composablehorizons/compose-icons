package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Create: ImageVector
    get() {
        if (_Create != null) return _Create!!
        
        _Create = ImageVector.Builder(
            name = "create",
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
                moveTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineToRelative(3.75f)
                lineTo(17.81f, 9.94f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(3f, 17.25f)
                close()
                moveTo(5.92f, 19f)
                horizontalLineTo(5f)
                verticalLineToRelative(-0.92f)
                lineToRelative(9.06f, -9.06f)
                lineToRelative(0.92f, 0.92f)
                lineTo(5.92f, 19f)
                close()
                moveTo(20.71f, 5.63f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f)
                reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.build()
        
        return _Create!!
    }

private var _Create: ImageVector? = null

