package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hippo: ImageVector
    get() {
        if (_Hippo != null) return _Hippo!!
        
        _Hippo = ImageVector.Builder(
            name = "hippo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581.12f, 96.2f)
                curveToRelative(-27.67f, -0.15f, -52.5f, 17.58f, -76.6f, 26.62f)
                curveTo(489.98f, 88.27f, 455.83f, 64f, 416f, 64f)
                curveToRelative(-11.28f, 0f, -21.95f, 2.3f, -32f, 5.88f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                horizontalLineToRelative(-16f)
                curveToRelative(-13.25f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(48.98f)
                curveTo(286.01f, 79.58f, 241.24f, 64f, 192f, 64f)
                curveTo(85.96f, 64f, 0f, 135.64f, 0f, 224f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-70.79f)
                curveTo(128.35f, 407.57f, 166.72f, 416f, 208f, 416f)
                reflectiveCurveToRelative(79.65f, -8.43f, 112f, -22.79f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(288f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-92.02f)
                curveToRelative(0f, -34.09f, -24.79f, -67.59f, -58.88f, -67.78f)
                close()
                moveTo(448f, 176f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Hippo!!
    }

private var _Hippo: ImageVector? = null

