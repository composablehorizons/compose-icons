package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
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
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(7f, -7.75f, 7f, -13f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(0.88f, 13.75f)
                horizontalLineToRelative(-1.75f)
                verticalLineTo(14f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.75f)
                close()
                moveToRelative(0f, -2.87f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(0f, -2.84f, 2.62f, -2.62f, 2.62f, -4.38f)
                curveToRelative(0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f)
                horizontalLineTo(8.5f)
                curveTo(8.5f, 6.57f, 10.07f, 5f, 12f, 5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 2.19f, -2.62f, 2.41f, -2.62f, 4.38f)
                close()
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null

