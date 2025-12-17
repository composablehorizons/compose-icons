package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mode: ImageVector
    get() {
        if (_Mode != null) return _Mode!!
        
        _Mode = ImageVector.Builder(
            name = "mode",
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
                moveTo(14.06f, 9.02f)
                lineTo(5f, 18.08f)
                verticalLineTo(19f)
                horizontalLineToRelative(0.92f)
                lineToRelative(9.06f, -9.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.37f, 3.29f)
                curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f)
                reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                close()
                moveToRelative(-0.56f, 6.65f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineToRelative(3.75f)
                lineTo(17.81f, 9.94f)
                close()
                moveTo(5f, 19f)
                verticalLineToRelative(-0.92f)
                lineToRelative(9.06f, -9.06f)
                lineToRelative(0.92f, 0.92f)
                lineTo(5.92f, 19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Mode!!
    }

private var _Mode: ImageVector? = null

