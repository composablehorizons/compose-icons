package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Subdirectory_arrow_left: ImageVector
    get() {
        if (_Subdirectory_arrow_left != null) return _Subdirectory_arrow_left!!
        
        _Subdirectory_arrow_left = ImageVector.Builder(
            name = "subdirectory_arrow_left",
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
                moveTo(5.71f, 15.71f)
                lineToRelative(4.58f, 4.58f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                lineTo(8.83f, 16f)
                horizontalLineTo(19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(8.83f)
                lineToRelative(2.88f, -2.87f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                lineToRelative(-4.58f, 4.58f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_left!!
    }

private var _Subdirectory_arrow_left: ImageVector? = null

