package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Interests: ImageVector
    get() {
        if (_Interests != null) return _Interests!!
        
        _Interests = ImageVector.Builder(
            name = "interests",
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
                moveTo(7.02f, 13f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(9.23f, 13f, 7.02f, 13f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineTo(13f)
                close()
                moveTo(7f, 2f)
                lineToRelative(-5f, 9f)
                horizontalLineToRelative(10f)
                lineTo(7f, 2f)
                close()
                moveTo(19.25f, 2.5f)
                curveToRelative(-1.06f, 0f, -1.81f, 0.56f, -2.25f, 1.17f)
                curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f)
                curveTo(13.19f, 2.5f, 12f, 3.78f, 12f, 5.25f)
                curveToRelative(0f, 2f, 2.42f, 3.42f, 5f, 5.75f)
                curveToRelative(2.58f, -2.33f, 5f, -3.75f, 5f, -5.75f)
                curveTo(22f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f)
                close()
            }
        }.build()
        
        return _Interests!!
    }

private var _Interests: ImageVector? = null

