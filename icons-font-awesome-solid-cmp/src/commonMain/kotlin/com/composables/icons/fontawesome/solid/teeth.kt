package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Teeth: ImageVector
    get() {
        if (_Teeth != null) return _Teeth!!
        
        _Teeth = ImageVector.Builder(
            name = "teeth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 0f)
                horizontalLineTo(96f)
                curveTo(42.98f, 0f, 0f, 42.98f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                horizontalLineToRelative(448f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                verticalLineTo(96f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                close()
                moveTo(160f, 368f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(144f, 120f)
                curveToRelative(0f, 30.93f, -25.07f, 56f, -56f, 56f)
                reflectiveCurveToRelative(-56f, -25.07f, -56f, -56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(0f, -120f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-88f)
                curveToRelative(0f, -30.93f, 25.07f, -56f, 56f, -56f)
                reflectiveCurveToRelative(56f, 25.07f, 56f, 56f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(144f, 120f)
                curveToRelative(0f, 30.93f, -25.07f, 56f, -56f, 56f)
                reflectiveCurveToRelative(-56f, -25.07f, -56f, -56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(0f, -120f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-88f)
                curveToRelative(0f, -30.93f, 25.07f, -56f, 56f, -56f)
                reflectiveCurveToRelative(56f, 25.07f, 56f, 56f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(128f, 128f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Teeth!!
    }

private var _Teeth: ImageVector? = null

