package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Lens_blur: ImageVector
    get() {
        if (_Lens_blur != null) return _Lens_blur!!
        
        _Lens_blur = ImageVector.Builder(
            name = "lens_blur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(6.55f, 13f, 6f, 13f)
                        close()
                        moveTo(6f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(6.55f, 17f, 6f, 17f)
                        close()
                        moveTo(6f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(6.55f, 9f, 6f, 9f)
                        close()
                        moveTo(3f, 9.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(3.28f, 9.5f, 3f, 9.5f)
                        close()
                        moveTo(6f, 5f)
                        curveTo(5.45f, 5f, 5f, 5.45f, 5f, 6f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(6.55f, 5f, 6f, 5f)
                        close()
                        moveTo(21f, 10.5f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(21.28f, 9.5f, 21f, 9.5f)
                        reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveTo(20.72f, 10.5f, 21f, 10.5f)
                        close()
                        moveTo(14f, 7f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        reflectiveCurveTo(13.45f, 7f, 14f, 7f)
                        close()
                        moveTo(14f, 3.5f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(14.28f, 2.5f, 14f, 2.5f)
                        reflectiveCurveTo(13.5f, 2.72f, 13.5f, 3f)
                        reflectiveCurveTo(13.72f, 3.5f, 14f, 3.5f)
                        close()
                        moveTo(3f, 13.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(3.28f, 13.5f, 3f, 13.5f)
                        close()
                        moveTo(10f, 20.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(10.28f, 20.5f, 10f, 20.5f)
                        close()
                        moveTo(10f, 3.5f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(10.28f, 2.5f, 10f, 2.5f)
                        reflectiveCurveTo(9.5f, 2.72f, 9.5f, 3f)
                        reflectiveCurveTo(9.72f, 3.5f, 10f, 3.5f)
                        close()
                        moveTo(10f, 7f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(9f, 5.45f, 9f, 6f)
                        reflectiveCurveTo(9.45f, 7f, 10f, 7f)
                        close()
                        moveTo(10f, 12.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                        reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                        reflectiveCurveTo(10.83f, 12.5f, 10f, 12.5f)
                        close()
                        moveTo(18f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(18.55f, 13f, 18f, 13f)
                        close()
                        moveTo(18f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(18.55f, 17f, 18f, 17f)
                        close()
                        moveTo(18f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(18.55f, 9f, 18f, 9f)
                        close()
                        moveTo(18f, 5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(18.55f, 5f, 18f, 5f)
                        close()
                        moveTo(21f, 13.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(21.28f, 13.5f, 21f, 13.5f)
                        close()
                        moveTo(14f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(14.55f, 17f, 14f, 17f)
                        close()
                        moveTo(14f, 20.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                        reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                        reflectiveCurveTo(14.28f, 20.5f, 14f, 20.5f)
                        close()
                        moveTo(10f, 8.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                        reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                        reflectiveCurveTo(10.83f, 8.5f, 10f, 8.5f)
                        close()
                        moveTo(10f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(10.55f, 17f, 10f, 17f)
                        close()
                        moveTo(14f, 12.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                        reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                        reflectiveCurveTo(14.83f, 12.5f, 14f, 12.5f)
                        close()
                        moveTo(14f, 8.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                        reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                        reflectiveCurveTo(14.83f, 8.5f, 14f, 8.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lens_blur!!
    }

private var _Lens_blur: ImageVector? = null

