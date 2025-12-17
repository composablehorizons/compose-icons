package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserAstronaut: ImageVector
    get() {
        if (_UserAstronaut != null) return _UserAstronaut!!
        
        _UserAstronaut = ImageVector.Builder(
            name = "user-astronaut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 224f)
                horizontalLineToRelative(13.5f)
                curveToRelative(24.7f, 56.5f, 80.9f, 96f, 146.5f, 96f)
                reflectiveCurveToRelative(121.8f, -39.5f, 146.5f, -96f)
                horizontalLineTo(384f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-13.5f)
                curveTo(345.8f, 39.5f, 289.6f, 0f, 224f, 0f)
                reflectiveCurveTo(102.2f, 39.5f, 77.5f, 96f)
                horizontalLineTo(64f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(40f, -88f)
                curveToRelative(0f, -22.1f, 21.5f, -40f, 48f, -40f)
                horizontalLineToRelative(144f)
                curveToRelative(26.5f, 0f, 48f, 17.9f, 48f, 40f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 53f, -43f, 96f, -96f, 96f)
                horizontalLineToRelative(-48f)
                curveToRelative(-53f, 0f, -96f, -43f, -96f, -96f)
                verticalLineToRelative(-24f)
                close()
                moveToRelative(72f, 72f)
                lineToRelative(12f, -36f)
                lineToRelative(36f, -12f)
                lineToRelative(-36f, -12f)
                lineToRelative(-12f, -36f)
                lineToRelative(-12f, 36f)
                lineToRelative(-36f, 12f)
                lineToRelative(36f, 12f)
                lineToRelative(12f, 36f)
                close()
                moveToRelative(151.6f, 113.4f)
                curveTo(297.7f, 340.7f, 262.2f, 352f, 224f, 352f)
                reflectiveCurveToRelative(-73.7f, -11.3f, -103.6f, -30.6f)
                curveTo(52.9f, 328.5f, 0f, 385f, 0f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                horizontalLineToRelative(128f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(80f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-9.6f)
                curveToRelative(0f, -69.4f, -52.9f, -125.9f, -120.4f, -133f)
                close()
                moveTo(272f, 448f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                reflectiveCurveToRelative(16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-96f, 0f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _UserAstronaut!!
    }

private var _UserAstronaut: ImageVector? = null

