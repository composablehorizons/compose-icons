package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TeethOpen: ImageVector
    get() {
        if (_TeethOpen != null) return _TeethOpen!!
        
        _TeethOpen = ImageVector.Builder(
            name = "teeth-open",
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
                verticalLineToRelative(64f)
                curveToRelative(0f, 35.35f, 28.66f, 64f, 64f, 64f)
                horizontalLineToRelative(512f)
                curveToRelative(35.34f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineTo(96f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                close()
                moveTo(160f, 176f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(144f, 0f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -30.93f, 25.07f, -56f, 56f, -56f)
                reflectiveCurveToRelative(56f, 25.07f, 56f, 56f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(144f, 0f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -30.93f, 25.07f, -56f, 56f, -56f)
                reflectiveCurveToRelative(56f, 25.07f, 56f, 56f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(0f, 144f)
                horizontalLineTo(64f)
                curveToRelative(-35.34f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                horizontalLineToRelative(448f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -35.35f, -28.66f, -64f, -64f, -64f)
                close()
                moveToRelative(-416f, 80f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(144f, -8f)
                curveToRelative(0f, 30.93f, -25.07f, 56f, -56f, 56f)
                reflectiveCurveToRelative(-56f, -25.07f, -56f, -56f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(24f)
                close()
                moveToRelative(144f, 0f)
                curveToRelative(0f, 30.93f, -25.07f, 56f, -56f, 56f)
                reflectiveCurveToRelative(-56f, -25.07f, -56f, -56f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(24f)
                close()
                moveToRelative(128f, 8f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                close()
            }
        }.build()
        
        return _TeethOpen!!
    }

private var _TeethOpen: ImageVector? = null

