package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CodeBranch: ImageVector
    get() {
        if (_CodeBranch != null) return _CodeBranch!!
        
        _CodeBranch = ImageVector.Builder(
            name = "code-branch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 144f)
                curveToRelative(0f, -44.2f, -35.8f, -80f, -80f, -80f)
                reflectiveCurveToRelative(-80f, 35.8f, -80f, 80f)
                curveToRelative(0f, 36.4f, 24.3f, 67.1f, 57.5f, 76.8f)
                curveToRelative(-0.6f, 16.1f, -4.2f, 28.5f, -11f, 36.9f)
                curveToRelative(-15.4f, 19.2f, -49.3f, 22.4f, -85.2f, 25.7f)
                curveToRelative(-28.2f, 2.6f, -57.4f, 5.4f, -81.3f, 16.9f)
                verticalLineToRelative(-144f)
                curveToRelative(32.5f, -10.2f, 56f, -40.5f, 56f, -76.3f)
                curveToRelative(0f, -44.2f, -35.8f, -80f, -80f, -80f)
                reflectiveCurveTo(0f, 35.8f, 0f, 80f)
                curveToRelative(0f, 35.8f, 23.5f, 66.1f, 56f, 76.3f)
                verticalLineToRelative(199.3f)
                curveTo(23.5f, 365.9f, 0f, 396.2f, 0f, 432f)
                curveToRelative(0f, 44.2f, 35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -34f, -21.2f, -63.1f, -51.2f, -74.6f)
                curveToRelative(3.1f, -5.2f, 7.8f, -9.8f, 14.9f, -13.4f)
                curveToRelative(16.2f, -8.2f, 40.4f, -10.4f, 66.1f, -12.8f)
                curveToRelative(42.2f, -3.9f, 90f, -8.4f, 118.2f, -43.4f)
                curveToRelative(14f, -17.4f, 21.1f, -39.8f, 21.6f, -67.9f)
                curveToRelative(31.6f, -10.8f, 54.4f, -40.7f, 54.4f, -75.9f)
                close()
                moveTo(80f, 64f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                close()
                moveToRelative(0f, 384f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
                moveToRelative(224f, -320f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                close()
            }
        }.build()
        
        return _CodeBranch!!
    }

private var _CodeBranch: ImageVector? = null

