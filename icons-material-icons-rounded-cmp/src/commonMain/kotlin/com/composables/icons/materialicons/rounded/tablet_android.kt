package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tablet_android: ImageVector
    get() {
        if (_Tablet_android != null) return _Tablet_android!!
        
        _Tablet_android = ImageVector.Builder(
            name = "tablet_android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 0f)
                horizontalLineTo(6f)
                curveTo(4.34f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(-4.5f, 22f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveToRelative(5.75f, -3f)
                horizontalLineTo(4.75f)
                verticalLineTo(3f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Tablet_android!!
    }

private var _Tablet_android: ImageVector? = null

