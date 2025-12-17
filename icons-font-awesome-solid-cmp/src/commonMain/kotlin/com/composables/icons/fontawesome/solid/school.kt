package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 224f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(80f)
                verticalLineTo(192f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                close()
                moveToRelative(360f, -48f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                close()
                moveToRelative(137.75f, -63.96f)
                lineToRelative(-160f, -106.67f)
                arcToRelative(32.02f, 32.02f, 0f, false, false, -35.5f, 0f)
                lineToRelative(-160f, 106.67f)
                arcTo(32.002f, 32.002f, 0f, false, false, 128f, 138.66f)
                verticalLineTo(512f)
                horizontalLineToRelative(128f)
                verticalLineTo(368f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(96f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(128f)
                verticalLineTo(138.67f)
                curveToRelative(0f, -10.7f, -5.35f, -20.7f, -14.25f, -26.63f)
                close()
                moveTo(320f, 256f)
                curveToRelative(-44.18f, 0f, -80f, -35.82f, -80f, -80f)
                reflectiveCurveToRelative(35.82f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.82f, 80f, 80f)
                reflectiveCurveToRelative(-35.82f, 80f, -80f, 80f)
                close()
                moveToRelative(288f, -64f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(224f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

