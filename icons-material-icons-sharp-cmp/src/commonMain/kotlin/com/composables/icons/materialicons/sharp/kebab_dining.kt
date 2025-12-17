package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Kebab_dining: ImageVector
    get() {
        if (_Kebab_dining != null) return _Kebab_dining!!
        
        _Kebab_dining = ImageVector.Builder(
            name = "kebab_dining",
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
                moveTo(7.75f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(5f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(1f)
                horizontalLineTo(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(9.88f, 19f, 8.5f, 19f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 19f, 3f, 17.88f, 3f, 16.5f)
                reflectiveCurveTo(4.12f, 14f, 5.5f, 14f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.25f)
                verticalLineTo(7f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 7f, 3f, 5.88f, 3f, 4.5f)
                reflectiveCurveTo(4.12f, 2f, 5.5f, 2f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(8.5f)
                curveTo(9.88f, 2f, 11f, 3.12f, 11f, 4.5f)
                reflectiveCurveTo(9.88f, 7f, 8.5f, 7f)
                horizontalLineTo(7.75f)
                verticalLineTo(8f)
                close()
                moveTo(17.75f, 7f)
                horizontalLineToRelative(0.75f)
                curveTo(19.88f, 7f, 21f, 5.88f, 21f, 4.5f)
                reflectiveCurveTo(19.88f, 2f, 18.5f, 2f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(15.5f)
                curveTo(14.12f, 2f, 13f, 3.12f, 13f, 4.5f)
                reflectiveCurveTo(14.12f, 7f, 15.5f, 7f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(1f)
                horizontalLineTo(13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1f)
                horizontalLineTo(15.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(19.88f, 14f, 18.5f, 14f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Kebab_dining!!
    }

private var _Kebab_dining: ImageVector? = null

