package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Insert_emoticon: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(8.5f, 8f)
                curveTo(9.33f, 8f, 10f, 8.67f, 10f, 9.5f)
                reflectiveCurveTo(9.33f, 11f, 8.5f, 11f)
                reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                reflectiveCurveTo(7.67f, 8f, 8.5f, 8f)
                close()
                moveTo(16.75f, 14.75f)
                curveTo(15.8f, 16.39f, 14.03f, 17.5f, 12f, 17.5f)
                reflectiveCurveToRelative(-3.8f, -1.11f, -4.75f, -2.75f)
                curveTo(7.06f, 14.42f, 7.31f, 14f, 7.69f, 14f)
                horizontalLineToRelative(8.62f)
                curveTo(16.7f, 14f, 16.94f, 14.42f, 16.75f, 14.75f)
                close()
                moveTo(15.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(14.67f, 8f, 15.5f, 8f)
                reflectiveCurveTo(17f, 8.67f, 17f, 9.5f)
                reflectiveCurveTo(16.33f, 11f, 15.5f, 11f)
                close()
            }
        }.build()
        
        return _Insert_emoticon!!
    }

private var _Insert_emoticon: ImageVector? = null

