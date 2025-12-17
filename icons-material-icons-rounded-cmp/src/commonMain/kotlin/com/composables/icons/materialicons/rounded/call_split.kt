package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Call_split: ImageVector
    get() {
        if (_Call_split != null) return _Call_split!!
        
        _Call_split = ImageVector.Builder(
            name = "call_split",
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
                moveTo(14.85f, 4.85f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-2.88f, 2.88f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(2.88f, -2.88f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.29f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.36f, 0.85f)
                close()
                moveTo(8.79f, 4f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineTo(6.29f, 7.7f)
                lineTo(11f, 12.4f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-5f, -5.01f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.31f, -0.3f, 0.09f, -0.84f, -0.36f, -0.84f)
                close()
            }
        }.build()
        
        return _Call_split!!
    }

private var _Call_split: ImageVector? = null

