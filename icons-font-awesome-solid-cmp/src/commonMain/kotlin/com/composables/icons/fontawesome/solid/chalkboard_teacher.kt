package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChalkboardTeacher: ImageVector
    get() {
        if (_ChalkboardTeacher != null) return _ChalkboardTeacher!!
        
        _ChalkboardTeacher = ImageVector.Builder(
            name = "chalkboard-teacher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 352f)
                curveToRelative(-2.39f, 0f, -4.78f, 0.35f, -7.06f, 1.09f)
                curveTo(187.98f, 357.3f, 174.35f, 360f, 160f, 360f)
                curveToRelative(-14.35f, 0f, -27.98f, -2.7f, -40.95f, -6.91f)
                curveToRelative(-2.28f, -0.74f, -4.66f, -1.09f, -7.05f, -1.09f)
                curveTo(49.94f, 352f, -0.33f, 402.48f, 0f, 464.62f)
                curveTo(0.14f, 490.88f, 21.73f, 512f, 48f, 512f)
                horizontalLineToRelative(224f)
                curveToRelative(26.27f, 0f, 47.86f, -21.12f, 48f, -47.38f)
                curveToRelative(0.33f, -62.14f, -49.94f, -112.62f, -112f, -112.62f)
                close()
                moveToRelative(-48f, -32f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                reflectiveCurveToRelative(-42.98f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 42.98f, -96f, 96f)
                reflectiveCurveToRelative(42.98f, 96f, 96f, 96f)
                close()
                moveTo(592f, 0f)
                horizontalLineTo(208f)
                curveToRelative(-26.47f, 0f, -48f, 22.25f, -48f, 49.59f)
                verticalLineTo(96f)
                curveToRelative(23.42f, 0f, 45.1f, 6.78f, 64f, 17.8f)
                verticalLineTo(64f)
                horizontalLineToRelative(352f)
                verticalLineToRelative(288f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                horizontalLineTo(384f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-76.24f)
                curveToRelative(19.1f, 16.69f, 33.12f, 38.73f, 39.69f, 64f)
                horizontalLineTo(592f)
                curveToRelative(26.47f, 0f, 48f, -22.25f, 48f, -49.59f)
                verticalLineTo(49.59f)
                curveTo(640f, 22.25f, 618.47f, 0f, 592f, 0f)
                close()
            }
        }.build()
        
        return _ChalkboardTeacher!!
    }

private var _ChalkboardTeacher: ImageVector? = null

