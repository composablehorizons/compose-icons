package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Insert_emoticon: ImageVector
    get() {
        if (_Insert_emoticon != null) return _Insert_emoticon!!
        
        _Insert_emoticon = ImageVector.Builder(
            name = "insert_emoticon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveToRelative(3.5f, -9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(16.33f, 8f, 15.5f, 8f)
                reflectiveCurveTo(14f, 8.67f, 14f, 9.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveToRelative(-7f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(7f, 8.67f, 7f, 9.5f)
                reflectiveCurveTo(7.67f, 11f, 8.5f, 11f)
                close()
                moveToRelative(3.5f, 6.5f)
                curveToRelative(2.33f, 0f, 4.31f, -1.46f, 5.11f, -3.5f)
                horizontalLineTo(6.89f)
                curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f)
                close()
            }
        }.build()
        
        return _Insert_emoticon!!
    }

private var _Insert_emoticon: ImageVector? = null

