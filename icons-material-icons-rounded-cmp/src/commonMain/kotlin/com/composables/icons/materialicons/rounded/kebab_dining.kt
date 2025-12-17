package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Kebab_dining: ImageVector
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
                moveTo(7.75f, 13f)
                verticalLineToRelative(1f)
                horizontalLineTo(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(3.25f)
                curveTo(7.75f, 22.66f, 7.41f, 23f, 7f, 23f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(19f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 19f, 3f, 17.88f, 3f, 16.5f)
                curveTo(3f, 15.12f, 4.12f, 14f, 5.5f, 14f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(7f)
                horizontalLineTo(5.5f)
                curveTo(4.12f, 7f, 3f, 5.88f, 3f, 4.5f)
                curveTo(3f, 3.12f, 4.12f, 2f, 5.5f, 2f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(1.75f)
                curveTo(6.25f, 1.34f, 6.59f, 1f, 7f, 1f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(2f)
                horizontalLineTo(8.5f)
                curveTo(9.88f, 2f, 11f, 3.12f, 11f, 4.5f)
                curveTo(11f, 5.88f, 9.88f, 7f, 8.5f, 7f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(1f)
                horizontalLineTo(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(7.75f)
                close()
                moveTo(17.75f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(3.25f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(19f)
                horizontalLineTo(15.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                curveTo(14.12f, 7f, 13f, 5.88f, 13f, 4.5f)
                curveTo(13f, 3.12f, 14.12f, 2f, 15.5f, 2f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(1.75f)
                curveTo(16.25f, 1.34f, 16.59f, 1f, 17f, 1f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(2f)
                horizontalLineToRelative(0.75f)
                curveTo(19.88f, 2f, 21f, 3.12f, 21f, 4.5f)
                curveTo(21f, 5.88f, 19.88f, 7f, 18.5f, 7f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(17.75f)
                close()
            }
        }.build()
        
        return _Kebab_dining!!
    }

private var _Kebab_dining: ImageVector? = null

